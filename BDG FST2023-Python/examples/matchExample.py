def provideAccess(user):
    return {
        "username": user,
        "password": "admin"
    }


def runMatch():
    user = str(input("Write your username -: "))

    # match statement
    match user:
        case "Om" | "Bharat":
            print("You are not allowed to access the database !")

        case "Anika":
            print("You are allowed to access the database !")
            data = provideAccess("Rishabh")
            print(data)
        case _:
            print("You are not a company member , you are not allowed to access the code !")


if __name__ == "__main__":
    for _ in range(2):
        runMatch()
