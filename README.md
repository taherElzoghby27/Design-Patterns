## strategy Design Pattern
🔍 𝐒𝐭𝐫𝐚𝐭𝐞𝐠𝐲 𝐃𝐞𝐬𝐢𝐠𝐧 𝐏𝐚𝐭𝐭𝐞𝐫𝐧 🔍

Ever encountered a situation where you needed to seamlessly switch between algorithms without rewriting your entire codebase? That's where the Strategy Design Pattern shines!

𝗪𝗵𝗮𝘁 𝗶𝘀 𝘁𝗵𝗲 𝗦𝘁𝗿𝗮𝘁𝗲𝗴𝘆 𝗗𝗲𝘀𝗶𝗴𝗻 𝗣𝗮𝘁𝘁𝗲𝗿𝗻?

At its core, the Strategy Design Pattern defines a family of algorithms, encapsulates each one, and allows them to be interchangeable. It empowers us to introduce new functionalities without restructuring existing code, tailoring behaviors to meet evolving business needs. By adhering to this pattern, we uphold key SOLID principles such as Single Responsibility and Open-Closed.

🌟𝗣𝗿𝗶𝗻𝗰𝗶𝗽𝗹𝗲𝘀 𝗼𝗳 𝗢𝗯𝗷𝗲𝗰𝘁-𝗢𝗿𝗶𝗲𝗻𝘁𝗲𝗱 𝗗𝗲𝘀𝗶𝗴𝗻 𝗲𝗺𝗯𝗼𝗱𝗶𝗲𝗱 𝗶𝗻 𝘁𝗵𝗶𝘀 𝗽𝗮𝘁𝘁𝗲𝗿𝗻 𝗶𝗻𝗰𝗹𝘂𝗱𝗲:

-Encapsulation of varying behaviors.

-Promoting composition over inheritance.

-Designing to interfaces, not concrete implementations.

🛠️𝗞𝗲𝘆 𝗖𝗼𝗺𝗽𝗼𝗻𝗲𝗻𝘁𝘀 𝗶𝗻 𝘁𝗵𝗲 𝗦𝘁𝗿𝗮𝘁𝗲𝗴𝘆 𝗣𝗮𝘁𝘁𝗲𝗿𝗻:

CONTEXT: The central class that defines the main interface, communicating with strategies through the Strategy interface.

STRATEGY INTERFACE: Shared across all concrete strategies, declaring a method for the context to execute a strategy.

CONCRETE STRATEGIES: Different algorithm implementations utilized by the context.

CLIENTS: The classes or code entities consuming the pattern.

🛠️𝗛𝗼𝘄 𝗗𝗼𝗲𝘀 𝗜𝘁 𝗪𝗼𝗿𝗸?

The Strategy Design Pattern segregates an object's behavior from the object itself, encapsulating behaviors into distinct strategies. Each strategy offers its unique implementation, fostering flexibility and maintainability.

🎯 𝗪𝗵𝗲𝗻 𝗗𝗼𝗲𝘀 𝗜𝘁 𝗦𝗼𝗹𝘃𝗲 𝗣𝗿𝗼𝗯𝗹𝗲𝗺𝘀?

-Multiple pathways to achieve a task.

-Need to switch between algorithm variants at runtime.

-Diverse classes with similar functionalities.

-when your class has a massive conditional statement that switches between -different variants of the same algorithm.

🌿𝗜𝗺𝗽𝗹𝗲𝗺𝗲𝗻𝘁𝗶𝗻𝗴 𝘁𝗵𝗲 𝗦𝘁𝗿𝗮𝘁𝗲𝗴𝘆 𝗗𝗲𝘀𝗶𝗴𝗻 𝗣𝗮𝘁𝘁𝗲𝗿𝗻:

-Identify the behavior to encapsulate.

-Define a Strategy Interface representing the behavior.

-Implement concrete classes with specific behavior variations.

-Create a context class to delegate behavior to the strategy object.

-Enable dynamic swapping of implementations at runtime.

🚫𝗪𝗵𝗲𝗻 𝘁𝗼 𝗻𝗼𝘁 𝘂𝘀𝗲 𝘁𝗵𝗲 𝘀𝘁𝗿𝗮𝘁𝗲𝗴𝘆 𝗽𝗮𝘁𝘁𝗲𝗿𝗻?

-If your code requires only a limited number of algorithm variations and you do not foresee the need for adding new ones in the future.

-When the algorithms to be encapsulated are straightforward and unlikely to undergo changes.

-If the logic variations are minimal and your code is already well-organized, opting for simplicity might be more suitable.

-Keep in mind that the Strategy Pattern adds overhead due to the extra layer of abstraction and potential object creation for strategies. In performance-critical scenarios, this overhead could have a significant impact. Therefore, consider alternative approaches for situations where speed is a priority.

Dive deeper into design patterns and enhance your software engineering toolbox with the adaptable Strategy Design Pattern!

#### main structure : 

![strategy](https://github.com/user-attachments/assets/3075d39e-2f63-4707-86c4-dee751941880)


structure for problem 1 :

![Screenshot 2024-07-15 at 3 03 53 PM](https://github.com/user-attachments/assets/596af59b-e300-4550-81dd-a3ab5f3951ad)

structure for problem 2 :

![duck](https://github.com/user-attachments/assets/a71e5d20-376b-448a-92e8-eaafba756305)




## Observer Design Pattern
