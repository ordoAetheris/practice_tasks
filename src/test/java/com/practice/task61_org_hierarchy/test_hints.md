# Подсказки для тестирования: OrgHierarchyService

## Обязательно протестировать
- addEmployee — CEO (managerId=null) и обычный сотрудник
- Попытка добавить второго CEO — ожидать IllegalStateException
- getDirectReports — только прямые подчинённые
- getAllSubordinates — рекурсивно все подчинённые
- getManagementChain — от сотрудника до CEO
- findCommonManager — ближайший общий менеджер двух сотрудников
- getTeamSize — корректный подсчёт всей вложенной команды
- moveEmployee — сотрудник переходит к новому менеджеру

## Продвинутые кейсы
- moveEmployee создаёт цикл (менеджер к своему подчинённому) — ожидать ошибку
- moveEmployee CEO — ожидать IllegalStateException
- findCommonManager для сотрудников в разных ветках
- findCommonManager когда один сотрудник — менеджер другого
- getDirectReports для сотрудника без подчинённых — пустой список
- Глубокая иерархия (5+ уровней) — getAllSubordinates корректен
- addEmployee с несуществующим managerId — ожидать ошибку
