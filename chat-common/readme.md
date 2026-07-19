Purpose of chat-common

The chat-common module is the shared foundation of your entire chat platform. Its purpose is to centralize code that is used by multiple modules, eliminating duplication and ensuring consistency across the application.

Rather than each module maintaining its own versions of DTOs, constants, enums, or utility classes, they all depend on a single shared library.

1. Shared DTOs

Defines how data moves between different parts of the system.

Examples:

LoginRequest
LoginResponse
UserResponse
MessageResponse
PaginationResponse

Purpose:

Standardize communication
Hide internal implementation details
Keep REST and WebSocket contracts consistent


2. Shared Constants

Stores application-wide constants.

Examples:

API endpoints
Security headers
Validation limits
Message strings
WebSocket destinations

Purpose:

Eliminate hard-coded values
Improve maintainability
Reduce typographical errors

3. Shared Enums

Defines fixed sets of values.

Examples:

UserStatus
MessageType
ChatType
UserRole
NotificationType

Purpose:

Instead of:

if(status.equals("ONLINE"))

Use:

if(status == UserStatus.ONLINE)

This provides compile-time safety and clearer code.

4. Shared Exceptions

Provides common exception classes.

Examples:

ResourceNotFoundException
ValidationException
AuthenticationException
BusinessException

Purpose:

Every module handles errors consistently.

6. Shared Utility Classes

Contains reusable helper methods.

Examples:

DateUtil
StringUtil
JsonUtil
ValidationUtil

Purpose:

Avoid repeating common functionality across modules.

7. Shared Validation

Reusable validation logic.

Examples:

EmailValidator
PasswordValidator
UsernameValidator

Purpose:

Centralize validation rules so they are applied consistently.

8. Shared Domain Models

Contains models that represent business concepts without being tied to persistence.

Examples:

User
Message
Group
Attachment

Purpose:

These models can be shared across services without exposing database-specific details.