# Code #1: Create a dates dataframe
import pandas
import pandas as pd

# Create dates dataframe with frequency
data = pd.date_range('1/1/2011', periods = 10, freq ='H')
print(data)


# importing pandas as pd
import pandas as pd

# Create the Timestamp object
ts = pd.Timestamp(year = 2009, month = 5, day = 31,
                  hour = 4, second = 49, tz = 'Europe/Berlin')

# Print the Timestamp object
print(ts)
