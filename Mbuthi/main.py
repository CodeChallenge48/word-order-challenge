import pathlib
import os
with open(os.path.join(pathlib.Path(__file__).parent, "test-2.txt"), mode="r") as file:
	text = file.readlines()



length = text[0]
if "," in length:
    length = length.replace(",", "")
length = int(length)
my_dict = {}

for i in range(1, length+1):
    word = text[i]
    if word not in my_dict:
        my_dict[word] = 1
    else:
        my_dict[word] += 1
print(len(my_dict))
for word, val in my_dict.items():
    print(val, end=" ")
    
    


