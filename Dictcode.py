dict = {
	'Two': 'One',
	'One': 'Two',
	'Five': 'Five',
}
sort_orders = sorted(dict.items(), key=lambda x: x[1], reverse=False)

for i in sort_orders:
	print(i[0], i[1])
