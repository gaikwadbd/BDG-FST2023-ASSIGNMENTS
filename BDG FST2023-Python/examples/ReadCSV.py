import pandas
dataframe = pandas.read_csv('../resources/employee.csv')
print(dataframe)
print(dataframe['Name'][5])