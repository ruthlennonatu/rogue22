## Foresight

Provides detailed visualisations giving insight for the CI/CD pipeline. Integrates with the application performance management (APM) tool Thundra and supports testing frameworks such as JUnit & Selenium. It is free for open-source projects up to 20 unique commiters.

### Implementation of Foresight 

The implementation of Foresight into the repository requires ownership permissions, therefore the team have [forked the rogue22 repo](https://github.com/L00163199/rogue22-performanceMonitoring) and integrated Foresight into it. To view performance metrics in Foresight:

1. An account must created [here](https://docs.runforesight.com/?_gl=1*1qrd34g*_ga*MTM2MjQwNDkwNy4xNjcwOTkxMzI0*_ga_TRGKRN61E5*MTY3MDk5MTMyMy4xLjAuMTY3MDk5MTMyMy4wLjAuMA..)
2. Follow successful account creation, the [Foresight GitHub marketplace app](https://github.com/marketplace/thundra-foresight) must be added to the repository
3. Now, the Foresight app must be added to the pipeline which can be done from the dashboard.<br><br>
<img width="595" alt="foresight-rogue22-connectPipeline" src="https://user-images.githubusercontent.com/115080487/207618266-cf7947a4-06e6-4e43-8520-fc926f821c65.png"><br>
Figure 1. Screenshot of connecting foresight to pipeline <br>

4. Lastly, the Foresight workflow steps must be added into the .yml file for the repository
<img width="370" alt="foresight-worfklow-screenshot1" src="https://user-images.githubusercontent.com/115080487/207618600-be1e67ce-7527-45c2-911f-69ca31aa7a1d.png">
Figure 2. Screenshot of initial step to integrate the Foresight workflow<br>
<img width="257" alt="foresight-worfklow-screenshot2" src="https://user-images.githubusercontent.com/115080487/207618610-4866d322-65b8-4d49-820d-64ef42b6f6d8.png">
Figure 3. Screenshot of final step to integrate the Foresight workflow<br>


### Foresight Analytics

Following successful integration of Foresight into the repository, the .yml file should now produce the workflow telemetry which is then read by Foresight to facilitate monitoring of the performance of the CI pipeline and the code, including tests. Some screenshots are included below, demonstrating only some of the visualisations provided by Foresight <br><br>
<img width="377" alt="foresight-rogue22-dashboard" src="https://user-images.githubusercontent.com/115080487/207618733-c1690bde-732e-4b1e-ac94-2b37081566f0.png"><br>
Figure 4. Screenshot of the forked rogue22 repo appearing on the Foresight dashboard<br><br>
<img width="913" alt="foresight-rogue22-processes-performance" src="https://user-images.githubusercontent.com/115080487/207618778-fd562d05-10b0-415a-a10d-cff1f360e919.png"><br><br>
Figure 5. Critical path of processes visualised by Foresight<br><br>
<img width="574" alt="foresight-rogue22-testSuite" src="https://user-images.githubusercontent.com/115080487/207618822-f8300002-063b-4e1c-ae99-104c8d38462f.png"><br><br>
Figure 6. Screenshot of the Foresight Test Suite depicting slowest performing tests (note in this example only 1 unit test is used)<br><br>
![foresight-rogue22-cpuMetrics](https://user-images.githubusercontent.com/115080487/207618844-29566930-e8ff-4085-9f17-a545eeea15b4.png)
Figure 7. Screenshot of CPU Load of user vs system<br><br>
![foresight-rogue22-memoryMetrics](https://user-images.githubusercontent.com/115080487/207618865-6aa3de15-4931-4ce3-9bbe-606fc54f2802.png)
Figure 8. Screenshot of memory usage during execution