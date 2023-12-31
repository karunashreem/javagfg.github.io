s = [i for i in s]
        uppers = 0
        for i in s:
            if i.isupper():
                uppers += 1
        return uppers