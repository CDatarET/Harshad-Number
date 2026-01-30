class Solution:
    def sumOfTheDigitsOfHarshadNumber(self, x):
        n = x
        add = 0
        while n > 0:
            add += n % 10
            n = n // 10

        if x % add == 0:
            return add

        return -1
