class HashTable:
    def __init__(self):
        self.size = 10
        self.hashmap = [[] for _ in range(0, self.size)]

    def hashing_func(self, key):
        hashed_key = hash(key) % self.size
        return hashed_key

    def set(self, key, value):
        global i
        hash_key = self.hashing_func(key)
        key_exist = False
        slot = self.hashmap[hash_key]
        for i, kv in enumerate(slot):
            k, v = kv
            if key == k:
                key_exist = True
                break
        if key_exist:
            slot[i] = (key, value)
            return slot
        else:
            slot.append((key, value))
            return slot

    def get(self, key):
        hash_key = self.hashing_func(key)
        slot = self.hashmap[hash_key]
        if slot:
            for kv in slot:
                k, v = kv
                if key == k:
                    return slot
        elif not slot:
            raise KeyError(key)

    def delete(self, key):
        global i
        hash_key = self.hashing_func(key)
        key_exists = False
        slot = self.hashmap[hash_key]
        for i, kv in enumerate(slot):
            k, v = kv
            if key == k:
                key_exists = True
                break
        if key_exists:
            del slot[i]
            return key
        else:
            raise KeyError(key)

    def show_hashmap(self):
        print(self.hashmap)


if __name__ == '__main__':

    hash_table = HashTable()
    print("---List:")
    hash_table.set("Canon", 2400)
    hash_table.set("Sony", 2800)
    hash_table.set("Panasonic", 3000)
    hash_table.show_hashmap()

    print(hash_table.get("Canon"))
    hash_table.delete("Canon")
    hash_table.show_hashmap()