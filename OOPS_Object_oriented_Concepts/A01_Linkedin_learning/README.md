# User defined functions and the this keyword

## Create new car (it's a contracter - also a methode)

<img width="1920" height="1080" alt="Screenshot (168)" src="https://github.com/user-attachments/assets/6fc8b619-981d-4bb4-b770-ae48f74de178" />
<img width="1920" height="1080" alt="Screenshot (169)" src="https://github.com/user-attachments/assets/078cf1d3-b20f-4ed4-8416-2898d9dbdced" />
<img width="1920" height="1080" alt="Screenshot (170)" src="https://github.com/user-attachments/assets/e0504dcc-4ea1-43b1-aff9-7ff7a3d1f496" />
<img width="1920" height="1080" alt="Screenshot (171)" src="https://github.com/user-attachments/assets/39900985-8b56-4fe2-bb63-71d60d7eb013" />

## Create a another methode to change colour

<img width="1920" height="1080" alt="Screenshot (172)" src="https://github.com/user-attachments/assets/6ce6481b-a476-4e05-82b5-0cc16e23ee1c" />
<img width="1920" height="1080" alt="Screenshot (173)" src="https://github.com/user-attachments/assets/c53bc35d-962a-4149-aaed-034e6a345757" />

---

# User input

<img width="1920" height="1080" alt="Screenshot (175)" src="https://github.com/user-attachments/assets/40b6f9d5-d191-4330-b623-6ca644c3a8c7" />
<img width="1920" height="1080" alt="Screenshot (176)" src="https://github.com/user-attachments/assets/44670955-4335-4d95-8a68-a1479900df17" />

## for other Data types

<img width="1920" height="1080" alt="Screenshot (177)" src="https://github.com/user-attachments/assets/8c7f9022-3d24-4298-a408-0a9930ff1427" />

## go into Data Structures

# Array

> The main differents of `array` & `string`, the data type , Array can store same Data Types in a contanear.

<img width="1920" height="1080" alt="Screenshot (178)" src="https://github.com/user-attachments/assets/7148f8c2-ffd6-48cd-8824-91b4d95ba549" />
<img width="1920" height="1080" alt="Screenshot (179)" src="https://github.com/user-attachments/assets/46738a5b-b7fe-46e1-8f6c-ee16ac866507" />

<img width="1920" height="1080" alt="Screenshot (181)" src="https://github.com/user-attachments/assets/df65d2ec-ae44-4914-a618-06f0f0534bf8" />
<img width="1920" height="1080" alt="Screenshot (182)" src="https://github.com/user-attachments/assets/227d4a1c-fa54-45d8-bbad-fb21abeedb6b" />
<img width="1920" height="1080" alt="Screenshot (183)" src="https://github.com/user-attachments/assets/882a64f1-7be4-43fa-bbdc-a27826571f67" />
<img width="1920" height="1080" alt="Screenshot (184)" src="https://github.com/user-attachments/assets/4e13d7e0-a676-4767-b6d0-6d1e4d98f372" />
<img width="1920" height="1080" alt="Screenshot (185)" src="https://github.com/user-attachments/assets/7a247aa0-6221-462e-a774-03c6196a5c95" />
<img width="1920" height="1080" alt="Screenshot (186)" src="https://github.com/user-attachments/assets/82801e48-21e8-4a88-830e-6b8fa5cb9f79" />

> Because `Array` s are [`Referance type`]() . so we use .toStrong `Class` otherWise we get a memory address.

## call by Value Vs call by Referance

<img width="1920" height="1080" alt="Screenshot (187)" src="https://github.com/user-attachments/assets/0f36a034-d6b8-4b57-a76e-4d20ff978607" />
<img width="1920" height="1080" alt="Screenshot (188)" src="https://github.com/user-attachments/assets/565466a4-04d2-4ce6-bf6b-1c1c8f198d96" />
<img width="1920" height="1080" alt="Screenshot (189)" src="https://github.com/user-attachments/assets/2b9f9a0d-608e-4946-abff-1e625d00a62f" />
<img width="1920" height="1080" alt="Screenshot (190)" src="https://github.com/user-attachments/assets/d3727145-d318-4817-9908-35c6d4ebf1c8" />
<img width="1920" height="1080" alt="Screenshot (191)" src="https://github.com/user-attachments/assets/16a98721-1858-4c53-b37e-a1a8aa57c071" />
<img width="1920" height="1080" alt="Screenshot (192)" src="https://github.com/user-attachments/assets/dc73da74-d375-4a8e-91d9-a3d1469275b8" />
<img width="1920" height="1080" alt="Screenshot (193)" src="https://github.com/user-attachments/assets/b809a675-0130-421d-82d6-4c2c11bcaa3a" />
<img width="1920" height="1080" alt="Screenshot (194)" src="https://github.com/user-attachments/assets/95634fae-6682-48a2-b302-0903e1886f58" />

---

## play with String

<img width="1920" height="1080" alt="Screenshot (197)" src="https://github.com/user-attachments/assets/3af4564c-e910-456b-843d-cca9c7b00260" />

## Chalange 01

<img width="1920" height="1080" alt="Screenshot (198)" src="https://github.com/user-attachments/assets/c730c272-f9c6-431b-9cf8-d6160a5a117a" />
<img width="1920" height="1080" alt="Screenshot (199)" src="https://github.com/user-attachments/assets/a0004827-51bf-487b-a225-d90d4a0cfd03" />

| [files](https://github.com/akashdip2001/Java/tree/main/OOPS_Object_oriented_Concepts/A01_Linkedin_learning/Ex_Files_Learning_Java/Exercise%20Files/Chapter%2002/02_10/end/src) |
| --- |

```java
public class Dog {

    String name;
    int age;
    String[] fetchedItems = {"bone", "stick", "ball"};
    private int fetchCounter = 0;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void bark() {
        System.out.println("Bark!");
    }

    public int getDogYears() {
        // Assume 1 dog year is 7 human years
        return this.age * 7;
    }

    public void fetch() {
        this.fetchCounter = (this.fetchCounter + 1) % 3;
        String item = this.fetchedItems[this.fetchCounter];
        System.out.println(name + " fetched a " + item + ".");
    }

}
```

---

## controll the code flow with IF-else && Loops
# 📖 Libraries

<img width="1920" height="1080" alt="Screenshot (324)" src="https://github.com/user-attachments/assets/de90fe3e-eb09-438f-af09-f10b38775519" />
<img width="1920" height="1080" alt="Screenshot (326)" src="https://github.com/user-attachments/assets/41f361e9-87d4-4c2d-a18c-e38a92fdebb9" />
<img width="1920" height="1080" alt="Screenshot (328)" src="https://github.com/user-attachments/assets/e42a192a-9fa0-472b-9001-6e39c77e9117" />
<img width="1920" height="1080" alt="Screenshot (327)" src="https://github.com/user-attachments/assets/f6de860a-fc34-4719-beb6-728245730582" />

