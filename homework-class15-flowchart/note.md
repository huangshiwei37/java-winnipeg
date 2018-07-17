
1. class

Customer
-----------------
String: id
String: name
Invoice[]: invoices


Invoice
---------------------
String: id
String: customerId
Item[]: items

void addAnItem(Item item)
double getNetPrice(): return net
double getGstTax(): return gstTax
double getPstTax(): return pstTax
double getTotalPrice(): return total
void printInvoice()

Item
---------------------
String: id
String: name
String: description
double: price

double getPrice(): return price
toString(): id, name, description, price

Tax
-------------------
double: GST_RATE
double: PST_RATE
double calculateGstTax(double amount): return gstTax
double calculatePstTax(double amount): return pstTax
double calculateTotalTax(double amount): return totalTax


2. input for making an invoice

customer id
customer name

number of items
ask for each item (id, name, description, price)

3. output 

invoice id
customer id
customer name
items (price)
net total price
GST
PST
total price with taxes




