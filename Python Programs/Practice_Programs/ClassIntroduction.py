class userDetails:
    company="MICROSOFT COMPANY"


    def __init__(self,name,fathersname,MotherName,age,qualification):
        self.name= name,
        self.fathersname=fathersname,
        self.motherName= MotherName,
        self.age= age,
        self.qualification= qualification

    def displayDetails(self):


        print(f'''    name :-{self.name}
    Father's Name:-{self.fathersname}
    Mother's Name:-{self.motherName}
    age:-{self.age}
    qualification:-{self.qualification}''')


MananDetails=userDetails('manan' ,'ManishBansal' , 'VandanaBansal' , 19 , 'Btech')
MananDetails.displayDetails()
print(MananDetails.name)