# Dictionary for item and price
# item as key & price as value
data = {'sugar': 80,'tea leaf': 200,'corn flakes': 60,'powder milk':120}

# Sorting on the basis of value in ascending order
sorted_result = sorted(data.items(), key = lambda x:(x[1]))
print('Dictionary after sorting:\n',sorted_result)

# Dictionary for item and price
# item as key & price as value
data = {'banana': 80,'cherry': 200,'apple': 60,'grapes':120}
# Dictionary for item and price
# item as key & price as value
data = {'banana': 80,'cherry': 200,'apple': 60,'grapes':120}
# Sorting on the basis of key in alphabetically ascending order
sorted_result = sorted(data.items())
print('Dictionary after sorting:\n',sorted_result)

# Dictionary for item and price
# item as key & price as value
# Sorting on the basis of key in alphabetically descending order
sorted_result = sorted(data.items(), reverse=True)

print('Dictionary after sorting:\n',sorted_result)