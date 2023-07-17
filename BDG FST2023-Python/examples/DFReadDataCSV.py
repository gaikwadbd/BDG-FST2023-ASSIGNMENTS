import pandas as pd
data = pd.read_csv("../resources/sampleData.csv")
# for data visualization we filter first 3 datasets
print(data.head(4))
for i, j in data.iterrows():
    print(i, j)
    print()

    # importing pandas as pd
import pandas as pd

# dictionary of lists
dict = {'Name':["aparna", "pankaj", "sudhir", "Geeku"],
        'Degree': ["MBA", "BCA", "M.Tech", "MBA"],
        'Score %':[90, 40, 80, 98]}

# creating a dataframe from a dictionary
df = pd.DataFrame(dict)
print(df)

# importing pandas module
import pandas as pd

# making data frame from csv file
data = pd.read_csv("../resources/sampleData.csv")

# for data visualization we filter first 3 datasets
col = data.head(5)
print(col)