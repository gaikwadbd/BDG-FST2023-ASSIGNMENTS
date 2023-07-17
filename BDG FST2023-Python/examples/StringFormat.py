# String concatenation using format
age = 36
txt = "My name is Bharat, and I am {}"
print(txt.format(age))

intQty = 30
intItemno = 567
floatPrice = 49.95
strMyorder = "I want {} pieces of item {} for {} dollars."
print(strMyorder.format(intQty, intItemno, floatPrice))
strMyorder = "I want to pay {2} dollars for {0} for {1} pieces of item."
print(strMyorder.format(intQty, intItemno, floatPrice))