# Подсказки для тестирования: SocialNetworkService

## Обязательно протестировать
- addUser + getFriends: дружба симметрична
- addFriendship с самим собой бросает исключение
- getMutualFriends возвращает общих друзей
- suggestFriends не включает уже существующих друзей и самого пользователя
- degreesOfSeparation: прямые друзья = 1, через одного = 2
- degreesOfSeparation: нет пути = -1
- findCommunities корректно находит компоненты связности

## Продвинутые кейсы
- suggestFriends ранжирует по количеству общих друзей
- removeFriendship удаляет связь в обе стороны
- findCommunities: несколько изолированных групп
- findCommunities: одиночный пользователь без друзей — отдельное сообщество
- degreesOfSeparation(user, user) = 0
- Дублирующая дружба (addFriendship дважды) обрабатывается корректно
- Несуществующий пользователь — обработка ошибки
