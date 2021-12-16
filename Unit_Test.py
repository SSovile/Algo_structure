import unittest
import main

class TestStringMethods(unittest.TestCase):
    def test_search(self):
        e = main.Rabin_Karp_Matcher("test", "s", 257, 11)
        self.assertEqual(e, [2])

if __name__ == '__main__':
    unittest.main()
