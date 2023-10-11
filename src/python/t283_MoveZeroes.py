def moveZeroes(self, nums: List[int]) -> None:
    j = 0
    for i in range(0, len(nums)):
        if nums[j] != 0:
            j = j + 1
        elif nums[i] != 0:
            nums[j] = nums[i]
            nums[i] = 0
            j = j + 1