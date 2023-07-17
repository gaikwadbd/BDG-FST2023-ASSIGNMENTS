"""""
File I/O
'w' -> Write-Only Mode
'r' -> Read-only Mode
'r+' -> Read And Write Mode
'a' -> Append Mode
"""

my_list = [1, 2, 3]

my_file = open("..\\firstfile.txt", "w")

for item in my_list:
    my_file.write(str(item) + "\n")

my_file.close()
"""""
File I/O
Reading a file -> .read()
Reading line by line -> .readline()
"""

my_file = open("..//firstfile.txt", 'r')

print(str(my_file.read()))
my_file.close()

print("Line by line ========>>")

my_file_line = open("..//firstfile.txt", 'r')
print(str(my_file_line.readline()))
print(str(my_file_line.readline()))
print(str(my_file_line.readline()))

my_file_line.close()