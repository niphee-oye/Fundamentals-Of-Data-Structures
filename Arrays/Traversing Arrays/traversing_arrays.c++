#include <iostream>
using namespace std;

int main(){
    int array[5];

    array[0] = 10;
    array[1] = 20;
    array[2] = 30;
    array[3] = 40;
    array[4] = 50;
    
    cout << " " << endl;
    for(int i = 0; i < 5; i++){
        cout << "The element at index " << i << " is " << array[i] << endl;
    }cout << " " << endl;
}