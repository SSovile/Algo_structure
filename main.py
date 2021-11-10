from queue import PriorityQueue

class Djikstra_Graph:

    def __init__(self, amount):
        self.g = amount
        self.edges = [[-1 for i in range(amount)] for j in range(amount)]
        self.visited = []

    def djikstra(self, start):
        G = {g: float('inf') for g in range(self.g)}

        G[start] = 0

        queq = PriorityQueue()
        queq.put((0, start))

        while not queq.empty():
            (dist, current) = queq.get()
            self.visited.append(current)

            for neighbor in range(self.g):
                if self.edges[current][neighbor] != -1:
                    distance = self.edges[current][neighbor]
                    if neighbor not in self.visited:
                        old = G[neighbor]
                        new = G[current] + distance
                        if new < old:
                            queq.put((new, neighbor))
                            G[neighbor] = new
        return G


    def add_edge(self, u, g, weight):
        self.edges[u][g] = weight
        self.edges[g][u] = weight

if __name__ == '__main__':

    el = Djikstra_Graph(5)
    el.add_edge(0, 1, 2)
    el.add_edge(0, 3, 1)
    el.add_edge(1, 2, 8)
    el.add_edge(1, 3, 3)
    el.add_edge(1, 4, 10)
    el.add_edge(2, 4, 9)

    G = el.djikstra(0)

    for vertex in range(len(G)):
        print("Distance from vertex 0 to vertex", vertex, "is", G[vertex])
