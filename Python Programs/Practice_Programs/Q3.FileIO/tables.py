import os
for i in range(2,21):
    print("\n")
    for j in range(1,11):
        if(os.path.isdir('tables')):
            with open(f'tables/tableOf{i}.txt', 'a') as file:
                file.write(f'{i} X {j} =' + str(i*j) + '\n')

