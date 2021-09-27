from datetime import datetime
import sys
import sort

array = [1, 0, 4, 6, 6, 1]





if __name__ == '__main__':

    if len(sys.argv) != 3:
        print("usage: main.py order array")
        sys.exit(1)

    if sys.argv[1] == 'asc':
        order = True
    elif sys.argv[1] == 'desc':
        order = False
    else:
        print('Invalid order')
    array = list(map(int, sys.argv[2].split(",")))

    startTime = datetime.now()
    sort.quick_sort(array, order)
    print(array)
    print("Counts: " + sort.count + "Swaps: " + sort.swaps)
    print("Time:")
    print(datetime.now() - startTime)


