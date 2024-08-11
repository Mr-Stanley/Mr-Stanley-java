cardNumber = str(input("Hello, Kindly Enter Card Details To Verify: "))
cardNumberList = [int(digit) for digit in cardNumber]

if(len(cardNumberList) < 13 or len(cardNumberList) > 16):
	print('Invalid Card Length')
total = 0
sum_of_odd_places = 0

for digit in range (len(cardNumberList)-2,-1,-2):
	second_index = cardNumberList[digit] * 2 
	if(second_index > 9):
		second_index = second_index % 10 + second_index // 10
	total = total + second_index
#print(total)
for digit in range (len(cardNumberList)-1,0,-2):
	sum_of_odd_places = sum_of_odd_places + cardNumberList[digit] 
#print(sum_of_odd_places)
sum_total = sum_of_odd_places + total

print('*****************************************************')
if(cardNumberList[0] == 4):
	print('**Credit Card Type : Visa Card')
elif(cardNumberList[0] == 5):
	print('**Credit Card Type : Master Card')
elif(cardNumberList[0] == 6):
	print('**Credit Card Type : Discover Card')
elif(cardNumberList[0] == 3 and cardNumberList[1] == 7):
	print('**Credit Card Type :  American Express Card')
else:
	print('Card Type Not Recognised')
print('**Credit Card Number :' + cardNumber)
print('**Credit Card Digit Length :',len(cardNumber))

if(sum_total % 10 == 0):
	print('**Credit Card Validity Status :'+'valid')
else:
	print('**Credit Card Validity Status :'+'invalid')

print('*****************************************************')