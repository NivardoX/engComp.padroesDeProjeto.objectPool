
class ReusablePool:
    """
    Manage Reusable objects for use by Client objects.
    """

    def __init__(self, size):
        self._reusables = [Reusable() for _ in range(size)]

        print("Pool com " + str(len(self._reusables))+ " objetos criada.")

    def acquire(self):

        aux =  self._reusables.pop()
        print("Adiquirindo objeto com id " + str(id(aux)))
        return aux

    def release(self, reusable):
        self._reusables.append(reusable)
        print("Liberando objeto com id " + str(id(reusable)))

class Reusable:
    """
    Collaborate with other objects for a limited amount of time, then
    they are no longer needed for that collaboration.
    """

    pass


def main():
    reusable_pool = ReusablePool(10)
    reusable = reusable_pool.acquire()
    reusable_pool.release(reusable)


if __name__ == "__main__":
    main()