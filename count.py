
# e.g: text = HelloOo
def count_char(text):
	character = {}
# the dictionary character: {"H":1, "e":1,"l":2, "o" :2..etc}
# ch:represet the character, character[ch] represent the value
    # and print out each character along with its count
	for ch in text:
		character[ch] = text.count(ch)	# count occurrances of each character
	for i in character:
		print(i + " " + str(character[i]))	
	# convert int-type as string to allow printed
		

def count_char_insensitive(text):
    
	# convert all letters in text to lower case, run the count function
	return count_char(text.lower())	

def count_char_ordered(text):
    pass
