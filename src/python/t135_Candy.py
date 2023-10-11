def candy(self, ratings):
    n = len(ratings)
    result = 1
    up, down, peak = 0, 0, 0
    for i in range(1, n):
        if ratings[i - 1] < ratings[i]:
            up = up + 1
            peak = up
            down = 0
            result += 1 + peak
        elif ratings[i - 1] == ratings[i]:
            peak = up = down = 0
            result = result + 1
        else:
            up = 0
            down = down + 1
            result += down + 1 if peak < down else down
    return result