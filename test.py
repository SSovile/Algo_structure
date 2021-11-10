import unittest

from main import Djikstra_Graph

class Test(unittest.TestCase):


    def test_add_edge(self):

        graph = Djikstra_Graph(2)
        self.assertEqual(graph.add_edge(0, 1, 2),   [(0, 1, 2)])



if __name__ == '__main__':
    unittest.main()