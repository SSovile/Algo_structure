import unittest
import sort

class SortTest(unittest.TestCase):
    def test_quick_sort_asc(self):
        array = [1, 0, 4, 6, 6, 1]
        sorted_array = [0, 1, 1, 4, 6, 6]
        sort.quick_sort(array)
        self.assertListEqual(array, sorted_array)

    def test_quick_sort_desc(self):
        array = [1, 0, 4, 6, 6, 1]
        sorted_array = [6, 6, 4, 1, 1, 0]
        sort.quick_sort(array, False)
        self.assertListEqual(array, sorted_array)

    def test_quick_sort_asc_asc(self):
        array = [0, 1, 1, 4, 6, 6]
        sorted_array = [0, 1, 1, 4, 6, 6]
        sort.quick_sort(array)
        self.assertListEqual(array, sorted_array)

    def test_quick_sort_desc_desc(self):
        array = [6, 6, 4, 1, 1, 0]
        sorted_array = [6, 6, 4, 1, 1, 0]
        sort.quick_sort(array, False)
        self.assertListEqual(array, sorted_array)

    def test_quick_sort_asc_desc(self):
        array = [0, 1, 1, 4, 6, 6]
        sorted_array = [6, 6, 4, 1, 1, 0]
        sort.quick_sort(array,False)
        self.assertListEqual(array, sorted_array)

    def test_quick_sort_desc_asc(self):
        array = [6, 6, 4, 1, 1, 0]
        sorted_array = [0, 1, 1, 4, 6, 6]
        sort.quick_sort(array)
        self.assertListEqual(array, sorted_array)
