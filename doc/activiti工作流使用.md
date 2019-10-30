
## 组任务及三种分配方式
1：在taskProcess.bpmn中直接写 candidate-users=“张三,李四,王五”
2：在taskProcess.bpmn中写 candidate-users =“#{userIds}”，变量的值要是String的（使用流程变量指定办理人）。
3：使用TaskListener接口，使用类实现该接口，在类中定义添加组任务的用户
个人任务和组任务存放办理人对应的表：
act_ru_identitylink表存放任务的办理人，包括个人任务和组任务，表示正在执行的任务
act_hi_identitylink表存放任务的办理人，包括个人任务和组任务，表示历史任务
区别在于：如果是个人任务TYPE的类型表示participant（参与者）, 如果是组任务TYPE的类型表示candidate（候选者）和participant（参与者）
