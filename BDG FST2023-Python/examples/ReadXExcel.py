import pandas
dataframe = pandas.read_excel("../resources/employee.xlsx", sheet_name="Sheet1")
print(dataframe)
print (dataframe ["Name"][4])
print (dataframe ["Salary"][4])