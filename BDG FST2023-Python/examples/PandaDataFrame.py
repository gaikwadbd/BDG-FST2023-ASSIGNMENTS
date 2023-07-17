# Import pandas package
import pandas as pd

# Define a dictionary containing Students data
data = {'Name': ['Jai', 'Princi', 'Gaurav', 'Anuj'],
        'Height': [5.1, 6.2, 5.1, 5.2],
        'Qualification': ['Msc', 'MA', 'Msc', 'Msc']}

# Convert the dictionary into DataFrame
df = pd.DataFrame(data)

# Declare a list that is to be converted into a column
address = ['Delhi', 'Bangalore', 'Chennai', 'Patna']
state = ['Delhi', 'Karnataka', 'Tamilnadu', 'Bihar']
# Using 'Address' as the column name
# and equating it to the list
df['Address'] = address
df['State'] = state
# Observe the result
print(df)


# Method #2: By using DataFrame.insert()

# Import pandas package
import pandas as pd

# Define a dictionary containing Students data
data = {'Name': ['Jai', 'Princi', 'Gaurav', 'Anuj'],
        'Height': [5.1, 6.2, 5.1, 5.2],
        'Qualification': ['Msc', 'MA', 'Msc', 'Msc']}

# Convert the dictionary into DataFrame
df = pd.DataFrame(data)

# Using DataFrame.insert() to add a column
df.insert(2, "Age", [21, 23, 24, 21], True)

# Observe the result
print(df)

# Method #3: Using Dataframe.assign() method
# Import pandas package
import pandas as pd

# Define a dictionary containing Students data
data = {'Name': ['Jai', 'Princi', 'Gaurav', 'Anuj'],
        'Height': [5.1, 6.2, 5.1, 5.2],
        'Qualification': ['Msc', 'MA', 'Msc', 'Msc']}


# Convert the dictionary into DataFrame
df = pd.DataFrame(data)

# Using 'Address' as the column name and equating it to the list
df2 = df.assign(address=['Delhi', 'Bangalore', 'Chennai', 'Patna'])
df2 = df2.assign(state=['Delhi', 'Karnataka', 'Tamilnadu', 'Bihar'])
# Observe the result
print(df2)


#Method #4: By using a dictionary
# Import pandas package
import pandas as pd

# Define a dictionary containing Students data
data = {'Name': ['Jai', 'Princi', 'Gaurav', 'Anuj'],
        'Height': [5.1, 6.2, 5.1, 5.2],
        'Qualification': ['Msc', 'MA', 'Msc', 'Msc']}

# Define a dictionary with key values of
# an existing column and their respective
# value pairs as the # values for our new column.
address = {'Delhi': 'Jai', 'Bangalore': 'Princi',
           'Patna': 'Gaurav', 'Chennai': 'Anuj'}

# Convert the dictionary into DataFrame
df = pd.DataFrame(data)

# Provide 'Address' as the column name
df['Address'] = address

# Observe the output
print(df)
