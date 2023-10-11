class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n: int = len(nums)
        result = [1] * n
        if n == 0:
            return result

        result[0] = 1
        prod = 1
        for i in range(1, n):
            prod *= nums[i - 1]
            result[i] = prod

        prod = 1
        for i in range(n - 1, -1, -1):
            result[i] *= prod
            prod *= nums[i]

        return result
