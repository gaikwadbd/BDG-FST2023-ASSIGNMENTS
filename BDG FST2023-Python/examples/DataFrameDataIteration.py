# importing pandas as pd
import pandas as pd

# dictionary of lists
dict = {'Name':["Aparna", "Pankaj", "Sudhir", "Geeku"],
        'Degree': ["MBA", "BCA", "M.Tech", "MBA"],
        'Score %':[90, 40, 80, 98]}

# creating a dataframe from a dictionary
df = pd.DataFrame(dict)

print(df)

# iterating over rows using iterrows() function
for i, j in df.iterrows():
        print(i, j)
        print()
