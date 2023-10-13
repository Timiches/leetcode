class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        result: list[bool] = []
        maxCand = max(candies)
        for i in range(len(candies)):
            result.append(candies[i] + extraCandies >= maxCand)
        return result
