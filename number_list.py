def find_reverse(numbers):

	return numbers[::-1]

def find_max(numbers):
	
	return max(numbers)

def find_min(numbers):

	return min(numbers)
 
def find_sum(numbers):

	return sum(numbers)

def find_average(numbers):

	return sum(numbers)/len(numbers)

def find_descending(numbers):

	return sorted(numbers,reverse=True)

def second_smallest(numbers):
	new_list = sorted(numbers)	# sort in increasing order first
	smallest = min(new_list)
	for num in new_list:
		if(num > smallest):		# loop through to find the second min
			return num
			break

def kth_smallest(numbers, k):
	sorted_list = sorted(numbers)	# sort the list
	smallest = min(numbers)
	new_list = []
	new_list.append(smallest)
	for nums in sorted_list:
		if (nums > smallest):
			smallest = nums		#remove duplicates and form a new list
			new_list.append(smallest)
	return new_list[k-1]

if __name__ == '__main__':
    # If you are testing, place your print statements here
	pass
