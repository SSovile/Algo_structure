def Rabin_Karp_Matcher(text, pattern, d, q):
    n = len(text)
    m = len(pattern)
    h = pow(d, m - 1) % q
    p = 0
    t = 0
    result = []
    for i in range(m):
        p = (d * p + ord(pattern[i])) % q
        t = (d * t + ord(text[i])) % q
    for s in range(n - m + 1):
        if p == t:
            match = True
            for i in range(m):
                if pattern[i] != text[s + i]:
                    match = False
                    break
            if match:
                result = result + [s]
        if s < n - m:
            t = (t - h * ord(text[s])) % q
            t = (t * d + ord(text[s + m])) % q
            t = (t + q) % q
    return result


if __name__ == '__main__':

    print("Search:", Rabin_Karp_Matcher("ker der swe", "swe", 257, 11))
