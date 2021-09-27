count = 0
swaps = 0

def partition(array, begin, end, compare):
    global count, swaps
    pivot = begin
    for i in range(begin+1, end+1):
        count +=1
        if compare(array[i], array[begin]):
            count += 1
            swaps += 1
            pivot += 1
            array[i], array[pivot] = array[pivot], array[i]
    array[pivot], array[begin] = array[begin], array[pivot]
    return pivot


def quick_sort(array, asc=True):
    global count, swaps
    count, swaps = 0, 0
    begin = 0
    end = len(array) -1

    def _quicksort(array, begin, end):
        global count, swaps
        if begin >= end:
            count += 1
            return
        if asc:
            pivot = partition(array, begin, end, lambda a, b: a <= b)
        else:
            pivot = partition(array, begin, end, lambda a, b: a >= b)
        _quicksort(array, begin, pivot - 1)
        _quicksort(array, pivot + 1, end)

    return _quicksort(array, begin, end)
