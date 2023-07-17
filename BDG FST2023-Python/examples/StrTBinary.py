# This program converts string to Binary
def get_binary(string):
    binary_plain_text = ''
    for ch in string:
        binary_plain_text += bin(ord(ch))[2:].zfill(8)
    return binary_plain_text

print(get_binary("Welcome to FST May 2023"))