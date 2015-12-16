primes = []

# this is poorly written but uses dynamic programming as it should

def checkPrime(x):
    if x < 2:
        return False 
    for prime in primes:
        if (prime * prime) > x:
            return True
        if x % prime == 0:
            return False
    return True

def findFirstXPrimes(n):
    foundPrimes = 0
    i = 0
    primes.append(2)
    primes.append(3)
    while foundPrimes < n:
        if (checkPrime(i)):
            print str(foundPrimes) + ". " + str(i)
            foundPrimes += 1
            primes.append(i)
        i += 1

if __name__ == "__main__":
    x = 13
    findFirstXPrimes(x)
    #print "Hello, World."
