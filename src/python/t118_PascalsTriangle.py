def generate(self, numRows: int) -> List[List[int]]:
    result: list = []
    temp: list = [1]

    temp[0] = 1
    result.append(temp)

    for i in range(1, numRows):
        temp = list()
        temp.append(1)
        for j in range(1, i):
            temp.append(result[i - 1][j - 1] + result[i - 1][j])
        temp.append(1)
        result.append(temp)
    return result