class RailwayForm:
    formType= "RailWay Form"
    def printData(self):
        print("Name is: " , self.name)
        print("Train is: ", self.train)

mananApplication= RailwayForm()
mananApplication.name="Manan"
mananApplication.train="Rajdhani Express"
mananApplication.printData()