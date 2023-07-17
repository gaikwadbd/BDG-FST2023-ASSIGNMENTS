# control flow example
a = 5
b = 7
c = 9

if a > b:
    if a > c:
        print("a is the greatest")
    else:
        print("c is the greatest")
elif b > a:
    if b > c:
        print("b is the greatest")
    else:
        print("c is the greatest")
if a > b and a > c:
    print("a is the greatest")
elif b > a and b > c:
    print("b is the greatest")
elif c > a and c > b:
    print("c is the greatest")
