def sortArrayByParity(self, nums: List[int]) -> List[int]:
    i = 0
    j = len(nums) - 1
    temp = 0
    while i < j:
        if nums[i] % 2 == 0:
            i = i + 1
            continue
        if nums[j] % 2 == 1:
            j = j - 1
            continue
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
        i = i + 1
        j = j - 1
    return nums