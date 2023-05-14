import numpy as np
imprt pandas as pd
import os
for dirname, _, filenames in os.walk('/kaggle/input'):
  for filename in filenames:
    print(os.path.join(dirname,filename))
telecom = pd.read_csv('/kaggle/input/telecom-customer-churn-by-maven-analytics/telecom_customer_churn.csv')
telecom
telecom.info()
telecom.groupby('Customer Status')['Monthly Charge'].describe()
telecom.groupby('Customer Status')['Total Charges'].describe()
telecom.describe().T
telecom.groupby(['Customer Status','Married','Gender'])['Monthly Charge'].describe()
telecom.groupby(['Customer Status'])['Avg Monthly GB Download'].describe()
import seaborn as sbn
sbn.lineplot(x='Tenure in Months',y='Monthly Charge', data=telecom)
sbn.lineplot(x='Avg Monthly GB Download',y='Total Charges', data=telecom)
sbn.lineplot(x='Avg Monthly GB Download',y='Total Extra Data Charges',data=telecom)
sbn.countplot(x='Customer Status',data=telecom)
sbn.boxplot(x='Customer Status',y='Monthly Charge',data=telecom)
