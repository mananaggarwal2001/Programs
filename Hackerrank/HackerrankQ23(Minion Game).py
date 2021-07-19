# string = input().upper()
# Stuart = []
# Kevin = []
# Common_List = []
# Vowels_List=['A','E','I','O','U']
# item = None
# Stuart_Score = 0
# Kevin_Score = 0
# Common_Set=set()

# LengthOfString = len(string)

# for i in range(LengthOfString):
#     for j in range(i, LengthOfString):

#         item = "".join(string[k] for k in range(i, j+1))
#         Common_List.append(item)


# Common_Set= set(item for item in Common_List)

# Kevin= list.__iter__(Common_List)
# print(Kevin)
# # for item in Common_Set:
# #     if str.startswith(item, 'A') or str.startswith(item, 'E') or str.startswith(item, 'I') or str.startswith(item, 'O') or str.startswith(item, 'U'):
# #         Kevin.append(item)
# #     else:
# #         Stuart.append(item)

# for item in Kevin:
#     for i in range(len(string)):
#         if string[i:].startswith(item):
#             Kevin_Score+=1

# for item in Stuart:
#     for i in range(len(string)):
#         if string[i:].startswith(item):
#             Stuart_Score+=1

# if Kevin_Score>Stuart_Score:
#     print("Kevin", Kevin_Score)
# elif Stuart_Score>Kevin_Score:
#     print("Stuart", Stuart_Score)
# else:
#     print("Draw")
string= input()

List= list("".join(string[k]) for i  in range(len(string)) for j in range(i ,len(string)) for k in range(i,j+1))
print(List)
