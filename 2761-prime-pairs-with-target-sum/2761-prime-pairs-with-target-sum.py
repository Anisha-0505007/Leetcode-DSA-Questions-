class Solution:
    def is_prime(self, num: int):
        if num < 2:
            return False
        # MINIMUM CHANGE: Only loop up to the square root of num
        for i in range(2, int(num**0.5) + 1):
            if num % i == 0:
                return False
        return True

    def findPrimePairs(self, n: int) -> List[List[int]]:
        result = []
        for a in range(2, n // 2 + 1):
            b = n - a
            if self.is_prime(a) and self.is_prime(b):
                result.append([a, b])
        return result