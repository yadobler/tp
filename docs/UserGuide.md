---
layout: page
title: MediBase3 User Guide
---

MediBase3 (MB3) is a **desktop app for doctors, offering an all in one solution to manage their patient records with ease.** Be it medical conditions, allergies, priorities or even appointments you can to leave it for us to handle and focus more on your patients! <br>
<br>
Optimized via combining both Command Line Interface (CLI) and an intuitive Graphical User Interface (GUI), if you can type fast, MediBase3 can get your patient management tasks done faster than traditional GUI apps.

## Table of Contents

* Table of Contents
{:toc}

## How to use this User Guide
Our user guide is tailored to ensure you can fully unlock the potential of MediBase3, whether you're new to MediBase3 or have been using the application for quite some time.
In this section, we aim to provide you with the necessary tools to effectively navigate and utilize the guide.

### Navigating the User Guide
Each aspect of MediBase3 is split into different sections, which are accessible via the Table of Contents above.

**For new MediBase3 users:**
1. We **recommend** that you finish reading this section to better understand the format of the user guide.
1. Once you are done, do head to the [Quick Start](#quick-start) section to get started with setting up MediBase3.

**For experienced MediBase3 users:**
1. If you need a quick refresher on how to use a specific feature in MediBase3, you can navigate to the [Features](#features) section.
1. You may also skip to the [Command Summary](#command-summary) section for a quick overview of all the commands available in MediBase3 and their formats.

For any additional information or queries, you can refer to the [FAQ](#faq) section or the [Known Issues](#known-issues) section.

### Glossary
As you read the user guide, you might encounter some unfamiliar technical terms. The table below provides the definitions for the key terms we will be using throughout the guide.

|-----------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Term      | Definition                                                                                                                                                                         |
|-----------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Command   | An input that is given to the application to perform a specific action. Commands are typically entered via the command box in the application.                                     |
| CLI       | Command Line Interface(CLI) is a type of text-based interface that is used to interact with software via commands.                                                                 |
| GUI       | Graphical User Interface(GUI) is a type of interface that allows users to interact with electronic devices through graphical icons and visual indicators.                          |
| JAR       | Java ARchive(JAR) is a package file format typically used to aggregate many Java class files and associated metadata and resources into one file for distribution.                 |
| JSON      | JavaScript Object Notation(JSON) is a lightweight data-interchange format that is easy for humans to read and write and easy for machines to parse and generate.                   |
| Parameter | A parameter refers to a field that requires input from the user. For example, in the command `delete i/S1234567A`, `i/S1234567A` is a parameter.                                   |
| Prefix    | A prefix is a keyword that is used to identify the type of parameter that follows it. For example, in the command `delete i/S1234567A`, `i/` is the prefix for the NRIC parameter. |
| Preamble  | A preamble refers to text before the first valid prefix.                                                                                                                           |

### Text Formatting Conventions
We will be using different text formatting styles to help you better understand the content of the user guide.

| Format                                   | Description                                                                                                                          |
|------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------|
| [hyperlink](#how-to-use-this-user-guide) | Blue hyperlinks are used to bring you to external websites or another section of the User Guide for more information.                |
| **Bold**                                 | Bold text is used to highlight important information or key points.                                                                  |
| `Monospace`                              | Text with a monospace font and a gray background is used to represent commands, parameters, code snippets and other technical terms. |

### Annotated Text-Box Conventions
The following annotated text-boxes are used throught this guide to provide useful insights on MediBase3 and its features:

{: .alert .alert-info}
> :information_source: **Note:**
> 
> Provides additional information about MediBase3 that you should be aware of.

{: .alert .alert-success}
> :bulb: **Tip:**
> 
> Provides helpful tips or suggestions to improve your experience with MediBase3.

{: .alert .alert-warning}
> :exclamation: **Caution:**
> 
> Warns you about potential issues or errors that you might encounter while using MediBase3.

[Back to Table of Contents](#table-of-contents)

## Quick Start

In this section, let's learn how to set up MediBase3 on your computer.

### Installing MediBase3

#### Step 1: Check if you have Java 17 installed on your system.

Before running MediBase3, ensure that **Java 17** is installed on your system.

Open **Command Prompt** (Windows) or **Terminal** (macOS/Ubuntu/Debian) and type:
> ```
> java -version
> ```  

If you are using Windows, you should see something like:

![javaVersionWindows.jpeg](images/javaVersionWindows.jpeg)

This means that your machine is running Java version 17.0.12, which means that Java 17 is installed.

if you are using macOS, Ubuntu or Debian, you should see something like this:

![javaVersionMacOS.png](images/javaVersionMacOS.png)

This means that your machine is running Java version 17.0.11, which means that Java 17 is installed.


If your Java version is **not 17**, you may refer to the [FAQ section](#faq) for instructions on installing Java 17. 


#### Step 2: Download the MediBase3 JAR File

1. Go to [this link](https://github.com/AY2425S1-CS2103T-F12-3/tp/releases/download/v1.3/medibase3.jar) and scroll down all the way to 'Assets'.  You should see something like this
![githubAssets.png](images/githubAssets.png)
1. Click on `medibase3.jar` to download the latest MediBase3 JAR File.
2. Save the file to a location of your choice (e.g., `Downloads` folder).

### Launching MediBase3

1. Open **Command Prompt** (Windows) or **Terminal** (macOS/Ubuntu/Debian).
2. Navigate to the directory where the `.jar` file is located. For example:
> ```
> cd Downloads
> ```
3. Run the application by typing:
> ```
> java -jar medibase3.jar
> ```

You should be greeted by the UI, which you will see in the next section.

### Overview of the GUI

Once MediBase3 is running, you will see the main interface. Here’s an overview of the key parts:

- **Command Box:** Where you can type and enter commands.
- **Result Display:** Shows the result of the command you entered.
- **Patient List:** Displays all the patients currently stored in the system.
- **Appointment List:** Displays the scheduled appointments for patients.
- **Menu (File/Help):** Provides additional options for managing the app (e.g., exit, access help).
- **Data Storage Location Footer:** Displays the location where patient and appointment data are stored.

![GUIOverview.jpg](images/GUIOverview.jpg)

### Overview of CLI

MediBase3 can be controlled using commands in the **Command Line Interface (CLI)**.

#### CLI Command Structure

Each command follows this structure:

![CommandPromptFormat.jpg](images/CommandPromptFormat.jpg)

Here’s a breakdown of the parts:

| **Component** | **Description**                                         |
|---------------|---------------------------------------------------------|
| **Command**   | The action you want to perform (e.g., `add`, `edit`)    |
| **Prefix**    | Identifies the data being entered (e.g., `n/` for name) |
| **Parameter** | The value associated with the prefix (e.g., `John Doe`) |

#### Example:
>```
> add n/John Doe i/S1234567A d/2000-01-01 g/M p/98765432 
> e/johnd@example.com a/311, Clementi Ave 2, #02-25
>```

- **Command:** `add`
- **Prefix:** `n/` (name), `i/` (NRIC), `d` (date of birth), `g` (gender), `p/` (phone), `e/` (email), `a/` (address)
- **Parameter:** `John Doe`, `S1234567A`, `2000-01-01`, `g`, `98765432`, `johndoe@example.com`, `311, Clementi Ave 2, #02-25`

### A First Look at MediBase3

Here’s a basic tutorial on how to start using the application:

1. **View the Help Guide:**
   - Once MediBase3 is running, you can type the following command to view the help window:
   >```
   > help
   >```
     
2. **Add a New Patient:**
   - To add a new patient, use the following command:
   >```
   > add n/John Doe i/S1234567A d/2000-01-01 g/M p/98765432 
   > e/johnd@example.com a/311, Clementi Ave 2, #02-25 
   >```

   - This will add a patient named John Doe to the system.


3. **Edit Patient Information:**
   - If there’s a typo or information changes, use the `edit` command:
   >```
   > edit S1234567A p/91234567 e/johndoe@example.com
   >```
     
   - This will change the phone number and email of the patient with NRIC S1234567A


4. **Find a Patient by NRIC:**
   - To find a patient by NRIC, type:
   >```
   > findNric T0123456A
   >```
     
   - This will show the patient with the NRIC `T0123456A`.


5. **Delete a Patient:**
   - To remove a patient who is no longer visiting the clinic/hospital, type:
   >```
   > delete T0123456A
   >```
   
     
   - This deletes the patient with the NRIC `T0123456A`.


6. **Clear All Entries:**
   - To remove all patient and appointment data from the system, type:
   >```
   > clear
   >```


You’re now ready to start using MediBase3.  
For a detailed list of features and instructions, see the [Features](#features) section.  
For additional assistance or common questions, please refer to our [FAQ](#faq) section.


[Back to Table of Contents](#table-of-contents)
## Features

### Parameter Details
The table below provides a brief explanation of each parameter associated with a patient in MediBase3. It also details
the constraints of each parameter when used in a command.

{: .alert .alert-warning}
> :exclamation: **Caution:** 
>
> Ensure that all parameters adhere to the constraints mentioned below. 
> Otherwise, the command will not be executed, and an error message will be displayed.

| Parameter         | Definition                                                                                                 | Constraints                                                                                                                                                                                                                                                                          | Examples                                                                                                                           |
|-------------------|------------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------|
| `NAME`            | Name of the patient                                                                                        | - Only alphanumeric characters are allowed.<br> - Should not be blank. <br> - Special characters are not allowed as `/` is used as a command delimiter. In the case where `s/o` should be used in a name, a simple workaround would be to use alternatives such as `s o` or `son of` | :white_check_mark: `John Doe`<br>:x: `$ally`                                                                                       |
| `NRIC`            | Singapore National Registration Identity Card (NRIC) number of the patient. It is unique for all patients. | - Case-insensitive. <br> - Should not be blank. <br> - Should start with a letter (S, F, G or M), followed by 7 digits, and end with a letter.                                                                                                                                       | :white_check_mark: `S1234567A` <br> :white_check_mark: `t1234567b` <br> :x: `1234567A`                                             |
| `DOB`             | Date of birth (DOB) of the patient.                                                                        | - Should be in the format `YYYY-MM-DD`. <br> - Should not be blank. <br> - Cannot be a date in the future.                                                                                                                                                                           | :white_check_mark: `2002-12-12` <br> :x: `2002/11/32`                                                                              |
| `GENDER`          | Gender of the patient.                                                                                     | - Case-insensitive. <br> - Should only be either `M` (Male) or `F` (Female). <br> - Should not be blank                                                                                                                                                                              | :white_check_mark: `m`<br>:white_check_mark: `F`<br>:x: `Male`                                                                     |
| `EMAIL`           | Email address of the patient.                                                                              | - Should be in the format `local-part@domain`. <br> - Should not be blank.                                                                                                                                                                                                           | :white_check_mark: `raj@gmail.com`<br>:x: `raj@gmail`                                                                              |
| `ADDRESS`         | Address of the patient.                                                                                    | - Any value is allowed. <br> - Should not be blank.                                                                                                                                                                                                                                  | :white_check_mark: `Orchard Road, Block 124, #02-01`                                                                               |
| `PHONE_NUMBER`    | Phone number of the patient.                                                                               | - Should only contain numbers.<br> - Should be at least 3 digits long <br> - Should not be blank. <br> - Spaces and symbols are not allowed.                                                                                                                                         | :white_check_mark: `98765432`<br>:x: `+65 9876 5432`                                                                               |
| `ALLERGY`         | Allergy of the patient.                                                                                    | - Only alphanumeric characters are allowed.<br> - Should not exceed 30 characters long <br> - Should not be blank.                                                                                                                                                                   | :white_check_mark: `Peanuts`<br>:x: `Pe@nuts`                                                                                      |
| `PRIORITY`        | Priority of the patient.                                                                                   | - Should only contain `NONE`, `LOW`, `MEDIUM` or `HIGH`. <br> - Case-insensitive. <br> - Should not be blank.                                                                                                                                                                        | :white_check_mark: `NONE` <br> :white_check_mark: `high` <br> :x: `Highpriority`                                                   |
| `CONDITION`       | Medical Condition of the patient.                                                                          | - Should contain only alphabets or alphanumerics. <br> - It must be no more than 30 characters. <br> - Should not be blank.                                                                                                                                                          | :white_check_mark: `High Blood Pressure` <br> :x: `@high-bp` <br>:x: `abcde fghijklmnopqrstuvwxyzabcde`                            |
| `DATE`            | Appointment date of the patient.                                                                           | - Should be in the format `YYYY-MM-DD`. <br> - Should not be blank.                                                                                                                                                                                                                  | :white_check_mark: `2024-10-27` <br> :x: `2022/10/27`                                                                              |
| `TIME`            | Appointment time of the patient.                                                                           | - Must be in the HHMM format (24-hour clock). <br> - Must be in interval. <br> - Time format should be (start time - end time) where start time < end time. <br> - The start time should not equal the end time. <br> - Should not be blank.                                         | :white_check_mark: `0900-1100` <br> :white_check_mark: `1400-1600` <br> :x: `0900-0900` <br> :x: `1400-1300`                       |
| `APPOINTMENTNAME` | Description of the appointment with the patient.                                                           | - Must be less than 30 characters. <br> - Only alphanumeric characters are allowed. <br> - Should not be blank                                                                                                                                                                       | :white_check_mark: `Dental` <br> :white_check_mark: `FollowUp1` <br> :x: `Follow-up#1` <br> :x: `abcde fghijklmnopqrstuvwxyzabcde` |

[Back to Table of Contents](#table-of-contents)

{: .alert .alert-info}
> **:information_source: Notes about the command format:**
> 
> * Words in `UPPER_CASE` are the parameters to be supplied by the user.
> e.g. in `add n/NAME i/NRIC g/GENDER d/DOB p/PHONE_NUMBER e/EMAIL a/ADDRESS`, `NAME` is a parameter which can be used as `n/John Doe`.
>
> * Items in square brackets are optional.
>  e.g `edit NRIC [n/NAME] [i/NRIC] [g/GENDER] [d/DOB] [p/PHONE_NUMBER] [e/EMAIL] [a/ADDRESS]` can be used as `edit S1234567A n/John Lim g/M` or as `edit S1234567A g/M`.
>
> * Items with `…` after them can be used multiple times.
>  e.g. `c/CONDITION…` can be used as, `c/Knee Pain`, `c/Flu c/Fever` etc.
>
> * Parameters that have a prefix can be in any order.
> e.g. if the command specifies `n/NAME p/PHONE_NUMBER`, `p/PHONE_NUMBER n/NAME` is also acceptable.
>
> * Parameters that have no prefix must follow the specified order in the command format.
> e.g. if the command specifies `NRIC n/NAME p/PHONE_NUMBER`, `NRIC` must take precedence over `n/NAME` and `p/PHONE_NUMBER`.
> 
> * Extraneous parameters for commands that do not take in parameters (such as `help`, `list`, `exit` and `clear`) will be ignored.
> e.g. if the command specifies `help 123`, it will be interpreted as `help`.
>
> * The command name and prefixes are case-sensitive.
> e.g. `add` is not the same as `Add`, `c/` is not the same as `C/`.
>
> * If you are using a PDF version of this document, be careful when copying and pasting commands that span multiple lines as space characters surrounding line-breaks may be omitted when copied over to the application.

### Managing Patient

#### Adding a patient: `add`

Adds a patient and their relevant details to MediBase3.

Format: `add n/NAME i/NRIC g/GENDER d/DOB p/PHONE_NUMBER e/EMAIL a/ADDRESS`

{: .alert .alert-info}
> :information_source: **Note:**
> 
> * All fields are compulsory and must be non-empty.
> * A patient will not be added if the NRIC given is already associated with another patient in MediBase3. An error message will be displayed in this case.
> * The new patient will be added to the end of the Patient List Panel.
> * Refer to the [Parameter Details](#parameter-details) section for more information on the purpose and constraints of each parameter.

Examples:
* `add n/John Doe i/S1234567A g/M d/2002-12-12 p/98765432 e/johnd@example.com a/Orchard Road, Block 124, #02-01`
* `add n/Betsy Crowe i/s1234567b g/F e/betsycrowe@example.com a/Bukit Merah, Block 123, #01-01 p/1234567 d/2002-11-10`

{: .alert .alert-success}
> :bulb: **Tip:**
> 
> * Remember that `NRIC` and `GENDER` are case-insensitive!
> E.g. `i/s1234567a` and `i/S1234567A` are both equivalent.
> * Made a mistake or a typo? You can use the [`edit` command](#editing-a-patient--edit) to update the patient's details.

[Back to Table of Contents](#table-of-contents)

#### Deleting a patient : `delete`

Deletes the specified patient and their details from MediBase3.

Format: `delete NRIC`

{: .alert .alert-info}
> :information_source: **Note:**
> 
> * Deletes the patient with the specified `NRIC` in MediBase3.
> * The `NRIC` provided must be the **full NRIC** of the patient to be deleted. e.g. `S1234567A` and not `S123`.
> * You can delete a patient even if they are not being currently displayed in the Patient List Panel.
> * `NRIC` must adhere to the constraints mentioned in the [Parameter Details](#Parameter-Details) section.

Example:
* `delete S1234567A` will delete the patient with the NRIC `S1234567A`.

{: .alert .alert-warning}
> :exclamation: **Caution:**
> 
> * Once a patient is deleted from MediBase3, you will be **unable to recover their information**.
> Please ensure that you have provided the correct `NRIC` of the patient that you want to delete.
> * Deleting a patient will also remove all their associated appointments from the Appointment List Panel.

[Back to Table of Contents](#table-of-contents)

#### Editing a patient : `edit`

Edits an existing patient details in MediBase3.

Format: `edit NRIC [n/NAME] [i/NRIC] [g/GENDER] [d/DOB] [p/PHONE_NUMBER] [e/EMAIL] [a/ADDRESS]`

{: .alert .alert-info}
> :information_source: **Note:**
> 
> * Edits the patient with the specified `NRIC` in MediBase3.
> * **At least one** of the optional fields must be provided. e.g. `edit S1234567A` is invalid.
> * Existing values will be updated to the given input values.
> * You can edit a patient's details even if they are not being currently displayed in the Patient List Panel.
> * Refer to the [Parameter Details](#parameter-details) section for more information on the purpose and constraints of each parameter.

Example:
*  `edit S1234567A p/91234567 e/johndoe@example.com` will edit the phone number and email address of the patient with the NRIC`S1234567A`
to `91234567` and `johndoe@example.com` respectively.

{: .alert .alert-success}
> :bulb: **Tip:**
> 
> Editing the patient's `NAME` or `NRIC` will also update their associated appointments in the Appointment List Panel to reflect the new change.

[Back to Table of Contents](#table-of-contents)

### Managing Appointments

#### Adding Appointments : `addAppt`

Allow doctors to schedule an appointment with a patient.

Format: `addAppt APPOINTMENTNAME i/NRIC @d/DATE @t/TIME`

{: .alert .alert-info}
> :information_source: **Note:**
>
> * Adds Appointment Time and Appointment Name to the patient with the specified `NRIC` in MediBase3.
> * Appointment time intervals cannot overlap with other existing appointment time intervals.
> * You can schedule an appointment to a patient even if they are not being currently displayed in the Patient List Panel but doing so will refresh the panel to display all patients after their appointment has been added.
> * Refer to the [Parameter Details](#parameter-details) section for more information on the purpose and constraints of each parameter.

Example:
* `addAppt Dental i/S1234567A @d/2024-10-27 @t/1100-1200` will schedule an appointment for the patient with NRIC `S1234567A` on `2024-10-27`, from `1100` to `1200` titled `Dental`. 

{: .alert .alert-success}
> :bulb: **Tip:**
>
> * Adding a new appointment will update the Appointment List Panel on the right with the new appointment details.
> * Appointment List Panel is displayed in chronological order.

[Back to Table of Contents](#table-of-contents)

#### Deleting Appointments : `delAppt`

Allow doctors to delete an appointment. 

Format: `delAppt i/NRIC @d/DATE @t/TIME`

{: .alert .alert-info}
> :information_source: **Note:**
> 
> * Unlike addAppt, there is no need for AppointmentName preamble.
> * Deletes Appointment from the patient with the specified `NRIC` in MediBase3.
> * You can delete an appointment from a patient even if they are not being currently displayed in the Patient List Panel but doing so will refresh the panel to display all patients after their appointment has been deleted.
> * Refer to the [Parameter Details](#parameter-details) section for more information on the purpose and constraints of each parameter.

Example:
* `delAppt i/S1234567A @d/2024-10-27 @t/1100-1200` will delete an appointment on `2024-10-27` from `1100` to `1200` for the patient with NRIC `S1234567A`.


  [Back to Table of Contents](#table-of-contents)

### Managing Medical Conditions

#### Adding Medical Conditions : `addMedCon`

Adds medical condition to an existing patient in MediBase3.

Format: `addMedCon i/NRIC c/CONDITION...`

{: .alert .alert-info}
> :information_source: **Note:**
>
> * Adds Medical Condition to the patient with the specified `NRIC` in MediBase3.
> * You can add a medical condition to a patient even if they are not being currently displayed in the Patient List Panel but doing so will refresh the panel to display all patients after medical condition has been added.
> * Refer to the [Parameter Details](#parameter-details) section for more information on the purpose and constraints of each parameter.

Example: 
* `addMedCon i/S1234567A c/High Blood Pressure` will add medical condition `High Blood Pressure` to patient with NRIC `S1234567A`.   

{: .alert .alert-success}
> :bulb: **Tip:**
>
> * User can add more than 1 Medical Condition through using `c/CONDITION` multiple times:
> * `addMedCon i/S1234567C c/High Blood Pressure c/Osteoporosis`

[Back to Table of Contents](#table-of-contents)

#### Deleting Medical Conditions : `delMedCon`

Deletes Medical Condition from an existing patient in MediBase3.

Format: `delMedCon i/NRIC c/CONDITION...`

{: .alert .alert-info}
> :information_source: **Note:**
>
> * Deletes Medical Condition from the patient with the specified `NRIC` in MediBase3.
> * You can delete a Medical Condition from a patient even if they are not being currently displayed in the Patient List Panel but doing so will refresh the panel to display all patients after medical condition has been removed.
> * Patient must have the Medical Condition in order to be able to be deleted, else an error message will show.
> * Refer to the [Parameter Details](#parameter-details) section for more information on the purpose and constraints of each parameter.

Example:
* `delMedCon i/S1234567A c/High Blood Pressure` will delete medical condition `High Blood Pressure` from patient with NRIC `S1234567A`.

{: .alert .alert-success}
> :bulb: **Tip:**
>
> * User can delete more than 1 Medical Condition through using `c/CONDITION` multiple times:
> * `delMedCon i/S1234567C c/High Blood Pressure c/Osteoporosis`

[Back to Table of Contents](#table-of-contents)

### Managing Allergies

#### Adding an allergy: `addAllergy`

Adds an allergy or multiple allergies to an existing patient in MediBase3.

Format: `addAllergy i/NRIC al/ALLERGY…`

{: .alert .alert-info}
> :information_source: **Note:**
>
> * Adds the specified `ALLERGY` to the patient with the given `NRIC` in MediBase3.
> * **At least one** `ALLERGY` must be provided. e.g. `addAllergy i/S1234567A` is invalid.
> * `ALLERGY` is case-insensitive. e.g. `addAllergy i/S123457A al/Peanuts` will add the allergy `PEANUTS` to the patient with the NRIC `S1234567A`.
> * `ALLERGY` and `NRIC` must adhere to the constraints mentioned in the [Parameter Details](#parameter-details) section.


{: .alert .alert-success}
> :bulb: **Tip:**
> 
> * You can add multiple allergies to a patient by using multiple `al/ALLERGY` parameters.
> * e.g. `addAllergy i/S1234567A al/Peanuts al/Dust al/Pollen`

Example:
* `addAllergy i/S1234567A al/Peanuts` will add the allergy `PEANUTS` to the patient with the NRIC `S1234567A`.<br>

[Back to Table of Contents](#table-of-contents)

#### Deleting an allergy: `delAllergy`

Deletes an allergy or multiple allergies to an existing patient in MediBase3.

Format: `delAllergy i/NRIC al/ALLERGY…`

{: .alert .alert-info}
> :information_source: **Note:**
>
> * Deletes the specified `ALLERGY` to the patient with the given `NRIC` in MediBase3.
> * **At least one** `ALLERGY` must be provided. e.g. `delAllergy i/S1234567A` is invalid.
> * `ALLERGY` is case-insensitive. e.g. `delAllergy i/S1234567A al/Peanuts` will delete the allergy `PEANUTS` from the patient with the NRIC `S1234567A`.
> * `ALLERGY` and `NRIC` must adhere to the constraints mentioned in the [Parameter Details](#parameter-details) section.

{: .alert .alert-success}
> :bulb: **Tip:**
>
> * You can delete multiple allergies to a patient by using multiple `al/ALLERGY` parameters.
> * e.g. `delAllergy i/S1234567A al/Peanuts al/Dust al/Pollen`

Example:
* `delAllergy i/S1234567A al/Peanuts` will delete the existing allergy `PEANUTS` from the patient with the NRIC `S1234567A`.<br>

[Back to Table of Contents](#table-of-contents)

### Managing Priority

#### Setting Priority : `setPriority`

Sets Priority to an existing patient in MediBase3.

Format: `setPriority i/NRIC !/PRIORITY`

{: .alert .alert-info}
> :information_source: **Note:**
>
> * Sets Priority to the patient with the specified `NRIC` in MediBase3.
> * You can set Priority to a patient even if they are not being currently displayed in the Patient List Panel but doing so will refresh the panel to display all patients after Priority has been set.
> * On default Patient has been set to `NONE` Priority level.
> * Refer to the [Parameter Details](#parameter-details) section for more information on the purpose and constraints of each parameter.

Example: 
* `setPriority i/S1234567A !/HIGH` will set the Priority of patient with NRIC `S1234567A` to `HIGH`.

[Back to Table of Contents](#table-of-contents)

### Finding Patients

{: .alert .alert-info}
> :information_source: **Note:**
> 
> * The following commands in this section will alter the view of the Patient List Panel to display only patients that match the given criteria.
> * They will not alter the view of the Appointment List Panel.

#### Listing all patients : `list`

Shows a list of all patients in MediBase3.

Format: `list`

{: .alert .alert-success}
> :bulb: **Tip:**
>
> If you have used any other commands under the [Finding Patients](#finding-patients) section to alter the view of the Patient List Panel, 
> you can use this command to reset to the default view to view all patients!

[Back to Table of Contents](#table-of-contents)

#### Listing all patients by their priority: `listPrio`

Shows a list of all patients with a specific `PRIORITY` in MediBase3.

Format: `listPrio !/PRIORITY`

{: .alert .alert-info}
> :information_source: **Note:**
> 
> * An empty Patient List Panel will be displayed if no patients with the given `PRIORITY` are found.
> * `PRIORITY` must adhere to the constraints mentioned in the [Parameter Details](#parameter-details) section. 

Example: 
* `listPrio !/High` will display all patients with the priority `HIGH`.

[Back to Table of Contents](#table-of-contents)

#### Locating patients by name: `find`

Finds patients whose names contain any of the given keywords.

Format: `find KEYWORD [MORE_KEYWORDS]`

{: .alert .alert-info} 
> :information_source: **Note:**
> 
> * The search is case-insensitive. e.g. `hans` will match `Hans`
> * The order of the keywords does not matter. e.g. `Hans Bo` will match `Bo Hans`
> * Only the name is searched.
> * Only **full words** will be matched e.g. `Han` will not match `Hans`
> * Patients matching at least one keyword will be returned (i.e. `OR` search).
  e.g. `Hans Bo` will return `Hans Gruber`, `Bo Yang`
> * Returns an empty patient list panel if no matching patients with the given keywords are found.

Examples:
* `find John` returns `john` and `John Doe`
* `find alex david` returns `Alex Yeoh`, `David Li`

![result for 'find alex david'](images/findAlexDavidResult.png)

[Back to Table of Contents](#table-of-contents)

#### Locating patients by medical condition: `findMedCon`

Finds patients whose medical condition(s) contain the given keywords.

Format: `findMedCon KEYWORD [MORE_KEYWORDS]`

{: .alert .alert-info}
> :information_source: **Note:**
>
> * The search is case-insensitive. e.g `diabetes` will match `Diabetes`
> * The order of the keywords does not matter. e.g. `diabetes arthritis` will match `arthritis` and `diabetes` 
> * Only the medical condition is searched.
> * Only **full words** will be matched e.g. `diabetes` will not match `diabete`
> * Patients matching at least one keyword will be returned (i.e. `OR` search).
>    e.g. `diabetes` will return `Alex Yeoh`, `David Li`
> * Returns an empty Patient List Panel if no matching patients with the given keywords are found.

Example:
 * `findMedCon diabetes arthritis` returns `Alex Yeoh` and `David Li`

[Back to Table of Contents](#table-of-contents)

#### Locating patient by NRIC: `findNric`

Finds patients based on their NRIC.

Format: `find NRIC`

{: .alert .alert-info}
> :information_source: **Note:**
> 
> * The search is case-insensitive. e.g `S1234567a` will match `S1234567A`
> * Only the `NRIC` is searched.
> * Only **full NRIC** will be matched e.g. `S1234567a` will not match `S12345`
> * Returns an empty Patient List Panel if no matching patients with the given `NRIC` are found.
> * `NRIC` must adhere to the constraints mentioned in the [Parameter Details](#parameter-details) section.

Example:
* `findNric S1234567A` returns `Alex Yeoh`

[Back to Table of Contents](#table-of-contents)

### General Features

#### Command History

You can navigate between previous successful commands and your current command by pressing the `UP` and `DOWN` arrow keys.

#### Viewing help : `help`

Shows a message explaining how to access the help page.

Format: `help`

![help message](images/helpMessage.png)

{: .alert .alert-success}
> :bulb: **Tip:**
> 
> You can also access this message by clicking on the `Help` button or by pressing `F1` on your keyboard.

[Back to Table of Contents](#table-of-contents)

#### Clearing all entries : `clear`

Clears all entries from the MediBase3 database. 

Format: `clear`

{: .alert .alert-warning}
> :exclamation: **Caution:**
>
> Using the clear command will **REMOVE** all your patient and appointment data from MediBase3. This action is irreversible.

[Back to Table of Contents](#table-of-contents)

#### Exiting the program : `exit`

Exits the program.

Format: `exit`

[Back to Table of Contents](#table-of-contents)

#### Saving the data

MediBase3 data are saved in the hard disk automatically after any command that changes the data. There is no need to save manually.

[Back to Table of Contents](#table-of-contents)

#### Editing the data file

MediBase3 data are saved automatically as a JSON file located at: `[JAR file location]/data/MediBase3.json`. Advanced users are welcome to update data directly by editing that data file.


{: .alert .alert-warning}
> :exclamation: **Caution:**
> 
> If your changes to the data file makes its format invalid, MediBase3 will discard all data and start with an empty data file at the next run. Hence, it is recommended to take a backup of the file before editing it.
>
> Furthermore, certain edits can cause the MediBase3 to behave in unexpected ways (e.g., if a value entered is outside of the acceptable range). Therefore, edit the data file only if you are confident that you can update it correctly.

[Back to Table of Contents](#table-of-contents)

## FAQ

#### **Q**: How do I transfer my data to another Computer?
 - **A**: Install the app in the other computer and overwrite the empty data file it creates with the file that contains the data of your previous MediBase3 home folder.<br>

#### **Q**: How do we open the command terminal?
 - **A**: Windows - Press `Win + R`, type `cmd` and press `Enter`.
 - **A**: Mac - Press `Cmd + Space`, type `terminal` and press `Enter`.
 - **A**: Linux - Press `Ctrl + Alt + T` to open the command terminal.

#### **Q**: How to install Java 17
 - **A**: Download the Java 17 [here](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html). Then follow the [installation guide](https://docs.oracle.com/en/java/javase/17/install/overview-jdk-installation.html).

##### For Windows

1. Visit the [Oracle JDK 17 download page](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html).
2. Download the appropriate installer for your system (e.g., `Windows x64 Installer`).
3. Run the installer and follow the setup instructions.
4. Verify the installation by opening **Command Prompt** and typing:
> ```
> java -version
> ```  

You should see something like:

![javaVersionWindows.jpeg](images/javaVersionWindows.jpeg)

This means that your machine is running Java version 17.0.12, which means that Java 17 is installed.

##### For macOS

1. Install **Homebrew** if you haven’t already. Open **Terminal** and type:
> ```
> /bin/bash -c "$(curl -fsSL \
> https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
> ```
2. Install Java 17 by typing:
> ```
> brew install openjdk@17
> ```
3. Link the installed JDK:
> ```
> sudo ln -sfn $(brew --prefix openjdk@17)/libexec/openjdk.jdk \
> /Library/Java/JavaVirtualMachines/openjdk-17.jdk
> ```
4. Verify the installation by typing:
> ```
> java -version
> ```

You should see something like this:

![javaVersionMacOS.png](images/javaVersionMacOS.png)

This means that your machine is running Java version 17.0.11, which means that Java 17 is installed.


##### For Ubuntu/Debian

1. Open **Terminal**.
2. Install Java 17 by typing:
> ```
> sudo apt install openjdk-17-jdk
> ```
3. Verify the installation by typing:
> ```
> java -version
> ```

You should see something like this:

![javaVersionLinux.jpg](images/javaVersionLinux.jpg)

This means that your machine is running Java version 17.0.11, which means that Java 17 is installed.

{: .alert .alert-info}
>:information_source: **Note**
>Depending on your system setup, you may need to install JavaFX separately. You can refer to the [OpenJFX installation guide](https://openjfx.io/openjfx-docs/#install-javafx) for detailed instructions.

{: .alert .alert-info}
> :information_source: **Note**
> For users of other operating systems, as long as you have the following installed, you can use MediBase3:
> - Java/OpenJDK 17
> - JavaFX/OpenJFX 17

{: .alert .alert-info}
>:information_source: **Note**
>Linux users with Wayland compositors should install OpenJFX 21 for compatibility.

[Return to Quick Start](#Quick-Start)

#### **Q**: Is there a limit to the number of patients/appointments we can add?
 - **A**: As of right now, We do not have a limit to the number of patients/appointments but is dependent on the hardware specification.

#### **Q**: Do you support non-English inputs?
 - **A**: We do not support non-English inputs, but we are working on it!

## Known issues

1. **When using multiple screens**, if you move the application to a secondary screen, and later switch to using only the primary screen, the GUI will open off-screen. The remedy is to delete the `preferences.json` file created by the application before running the application again.
2. **If you minimize the Help Window** and then run the `help` command (or use the `Help` menu, or the keyboard shortcut `F1`) again, the original Help Window will remain minimized, and no new Help Window will appear. The remedy is to manually restore the minimized Help Window.


## Command summary

| Action           | Format                                                                                  | Examples                                                                                                       |
|------------------|-----------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------------|
| **Add**          | `add n/NAME i/NRIC g/GENDER d/DOB p/PHONE_NUMBER e/EMAIL a/ADDRESS`                     | `add n/John Doe i/S1234567A g/M d/2002-12-12 p/98765432 e/johnd@example.com a/Orchard Road, Block 124, #02-01` |
| **AddAllergy**   | `addAllergy i/NRIC al/ALLERGY…`                                                         | `addAllergy i/S1234567A al/Dust al/Pollen`                                                                     |
| **AddAppt**      | `addAppt APPOINTMENTNAME i/NRIC @d/DATE @t/TIME`                                        | `addAppt Dental i/S1234567A @d/2024-10-27 @t/1100-1200`                                                        |
| **AddMedCon**    | `addMedCon i/NRIC c/CONDITION...`                                                       | `addMedCon i/S1234567A c/High Blood Pressure`                                                                  |
| **Clear**        | `clear`                                                                                 | -                                                                                                              |
| **Delete**       | `delete NRIC`                                                                           | `delete S1234567A`                                                                                             |
| **DelAllergy**   | `delAllergy i/NRIC al/ALLERGY…`                                                         | `delAllergy i/S1234567A al/Dust al/Pollen`                                                                     |
| **DelAppt**      | `delAppt i/NRIC @d/DATE @t/TIME`                                                        | `delAppt i/S1234567A @d/2024-10-27 @t/1100-1200`                                                               |
| **DelMedCon**    | `delMedCon i/NRIC c/CONDITION...`                                                       | `delMedCon i/S1234567A c/High Blood Pressure`                                                                  |
| **Edit**         | `edit NRIC [n/NAME] [i/NRIC] [g/GENDER] [d/DOB] [p/PHONE_NUMBER] [e/EMAIL] [a/ADDRESS]` | `edit S1234567A p/91234567 e/johndoe@example.com`                                                              |
| **Find**         | `find KEYWORD [MORE_KEYWORDS]`                                                          | `find James Jake`                                                                                              |
| **FindNric**     | `findNric NRIC`                                                                         | `findNric S1234567A`                                                                                           |
| **FindMedCon**   | `findMedCon KEYWORD [MORE_KEYWORDS]`                                                    | `findMedCon diabetes arthritis`                                                                                |
| **List**         | `list`                                                                                  | -                                                                                                              |
| **ListPrio**     | `listPrio !/PRIORITY`                                                                   | `listPrio !/High`                                                                                              |
| **Help**         | `help`                                                                                  | -                                                                                                              |




