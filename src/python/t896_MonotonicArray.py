def isMonotonic(self, nums: List[int]) -> bool:
    if len(nums) == 1:
        return True
    i = 1
    while i < len(nums) - 1:
        if nums[i] != nums[i - 1]:
            break
        i = i + 1
    if nums[i] > nums[i - 1]:
        for j in range(i, len(nums)):
            if nums[j] < nums[j - 1]:
                return False
    else:
        for j in range(i, len(nums)):
            if nums[j] > nums[j - 1]:
                return False
    return True