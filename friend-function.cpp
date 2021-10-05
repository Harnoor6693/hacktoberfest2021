    #include <iostream>  
    using namespace std;  
    class Distance  
    {  
        private:  
        int meters;  
        public:  
    // constructor  
        Distance()  
        {  
            meters = 0;  
        }  
        // definition of display_data() method  
        void display_data()  
        {  
            std::cout << "Meters value : " << meters<<std::endl;  
        }  
          
        //prototype of a friend function.  
        friend void addvalue(Distance &d);  
          
    };  
    // Definition of friend function  
    void addvalue(Distance &d) //  argument contain the reference  
    {  
        d.meters = d.meters+10; // incrementing the value of meters by 10.  
    }  
    // main() method  
    int main()  
    {  
        Distance d1; // creating the object of class distance.  
        d1.display_data(); // meters = 0  
        addvalue(d1); // calling friend function  
        d1.display_data(); // meters = 10  
        return 0;  
    }  
