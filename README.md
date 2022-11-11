# rogue22

BScDevOps Assign - Team Rogue

# Table of Contents
Preamble
Product Owner
Rockstars
Project Deadline
Project Specification
Useful Links
More Information
Risk Register
Tenants of Design
Social Contract
Meetings
Communication
Other
Branching Strategy
Estimating Story Points
Definition of Ready
Definition of Done
Preamble
This is the online repository for the DevOps Assignment.

<>.
Our product will be delivered using an Agile methodology that embraces the DevOps culture. Please note that our culture embraces change and these documents are treated as living, breathing artefacts that will be continuously updated.

# Scrum Master
- Week 5 - Mark
- Week 6 - Thomas
- Week 7 - Jamie
- Week 8 - Conor
- Week 9 - Ignacio
- Week 10 - Dylan
- Week 11 - Aran
- Week 12 - Natasha

# Product Owner
Mark

# Rockstars
Aran, Conor, Dylan, Ignacio, Jamie, Natasha, Thomas

# Project Deadline
Refer to BB for deadlines

# Project Specification
Clean and simple design
User access levels (client, administrator)
Includes at least one self developed api and one webservice
To be run over <specify platform>

# Frameworks
Database
Database persistence technology
Define the buisness Requirements
Named queries and database triggers for security
Regex for cleansing and validation of data before sending to the database.

# Useful Links
Project Slack: https://app.slack.com/client/T0419S2HV9B/C0473E7SCSY
GitHub: https://github.com/ruthlennonatu/rogue22
Jira: <Not yet applicable>

# More Information
For more information visit our other sections

# Section	Description
Process	Describes the companies process
Project Log	Log of project activities
Costings	Overview of the project cost
Architecture	Outlines the architecture
Environments	Overview of the environment set-up
DR Plan	Disaster Recovery Plan and procedures
Requirements	Overview of the requirements for the project
SLAs	Service level agreements
Risk Management	How we manage risk
Security	Overview of security
Project Log	Team log for the project

# Risk Register
These are the current Risks on the project, re-aligned on a weekly basis
-   Project incompletion due to time constraints

# Tenants of Design
Dedication to clean, secure, performant and self documented code
    code Frameworks used
    code coverage tool used
    Secure code: Regex for cleansing and validation, Named queries and database triggers
    performance testing tool to be used
Documentation / code commenting (javadoc)/seperate branch
Datastore for persistence

# Testing:
    Unit testing
    integration testing
    UA
# Environments:
    staging and production
    tight configuration management for consistency and reproducibility
    automated creation and deployments
    integrated and automated pipeline (commit -> test -> deploy)
# Github version control:
    branches used - Feature, Dev, test, main.
    version/release management

# Agile project management methods/principles (jira)

# Social Contract
# Meetings
Stand-ups will occur on every Wednesday, from 11:45 to 12:00 during class and Wednesday, from 11:45 to 12:00 using Automated bot.
Of those present at the meeting, the order that people give their updates will be based on alphabetical order on a first name basis, that is: Aran, Conor, Dylan, Ignacio, Jamie, Mark, Natasha and Thomas.
Updates will be in the form: What I've done, Impediments, What I plan to do.
Sprint planning will occur on every Friday, from 12:00 to 13:00 at the end of our sprint in a team call, using slack.
Please add and update items within github issues prior to the sprint planning session.
Sprint retro will occur at the end of our sprint on Fridays, from 11:45 to 12:00 (timebox retro for 15 minutes, to be organised by the scrum master).
Of those present at the meeting, the order that people present their sprint retro updates will be based on reverse alphabetical order on a first name basis, that is: Thomas, Natasha, Mark, Jamie, Ignacio, Dylan, Conor and Aran.
Points raised in the sprint retro will be noted and posted on the slack channel by the Scrum Master. The Scrum Master is rotated per team member every week.
Backlog refinement will happen on Wednesdays, from 12:05 to 12:50 during our sprint.
Task estimation will be done using the planning poker technique through a plugin for Jira. Come prepared to meetings. Be on time for Stand Ups and meetings. Mobile phones on silent. Everyone has equal voice and valuable contribution. Keep your language and tone professional at all times. Be honest.

# Communication
Slack is the preferred method of communication.
Communication in this order: Slack, Whatsapp, Microsoft Teams.
If a demonstration is required use Microsoft Teams / Zoom, record the session and upload to the Slack channel.
No Slack communications before 9am and after 6pm.
Raise a problem as soon as you see it.
Respect each other and understand differences in knowledge.
All team documents are to be created using Markdown language and shared on GitHub.
There are no silly questions, if you don’t understand, ask.
Share success stories.
Focus on the positives.
Don’t make assumptions.
Don’t interrupt and cut another person off while they are talking.
Listen when someone is talking, don’t interject.
Zero tolerance for bullying.

# Agile way of working.
If are assigned a job, take ownership of it and keep it up to date.
Stick to your agreed working patterns. Let the team know when you are late or going early.
Update the Scrum Board as you progress the story i.e. don’t update at standup.
Don't be afraid to ask for help.
Don't be afraid to give constructive criticism, as long as it is constructive.
Solve roadblocks within the team. If the impediment can’t be solved within the team then give it to the Scrum Master.
Sprints will start at 11.30am on Wednesdays.
The Scrum Master role rotates each week, the schedule is available on the process section.
GitHub Project will be used for task management and planning.
Each member of the team will work 4 hours per week, unless they are on vacation.
Branching Strategy:
main<-test<-dev<-feature-{Member Name}-{Work Type}


# Estimating Story Points
Each member must have input in the estimation of story points. 
Estimated using the Planned Poker extension for Slack. 
The most common selection will be the story point for that user story.
User stories with a story point larger than 5, will be split into smaller user stories.
The teams team's velocity is calculated by the number of story points we achieve on average in the previous sprints.
The teams current story point velocity is "N/A".

# Definition of Ready
Story is pointed
Enough information to start
Acceptance criteria is defined
Definition of Done
Code
Min of <<how many?>> reviewers
Merged into main
Deployed successfully
Deployment Tested
Documentation
Reviewed, followed and executed by Reviewer
Working solution over documentation
