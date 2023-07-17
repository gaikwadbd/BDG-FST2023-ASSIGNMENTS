
# Droping column from database
# importing pandas module
import pandas as pd

# making data frame from csv file
data = pd.read_csv("../resources/sampleData.csv", index_col ="Name" )
print('Data before droping:',data)
# dropping passed values
data.drop(["Avery Bradley", "John Holland", "R.J. Hunter",
           "R.J. Hunter"], inplace = True)

# display
print('Data after dropping: ',data)


# importing pandas module
import pandas as pd

# making data frame from csv file
data = pd.read_csv("../resources/sampleData.csv", index_col ="Name" )

# dropping passed columns
data.drop(["Team", "Weight"], axis = 1, inplace = True)

# display
print(data)
