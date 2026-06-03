# OtakuStream – Anime & Manga Platform

### Project Overview

OtakuStream is a full-stack web application that allows users to discover, track, and consume anime and manga content through a modern streaming and reading experience.

The platform combines anime streaming functionality with manga reading capabilities, providing users with a unified media library where they can watch episodes, read chapters, track progress, and manage favourites.

The project is designed as a portfolio-quality software engineering application that demonstrates full-stack development, REST API design, database modelling, authentication, media delivery, and scalable application architecture.

⸻

## Objectives

### The primary objectives of OtakuStream are to:

* Build a modern full-stack web application using industry-standard technologies.
* Provide a seamless anime and manga consumption experience.
* Allow users to track both watching and reading progress.
* Implement secure authentication and authorization.
* Demonstrate scalable software architecture and clean code practices.
* Create a portfolio project that reflects real-world product development.

⸻

## Technology Stack

Frontend

* Next.js
* TypeScript
* Tailwind CSS
* Axios
* React Query (optional)

Backend

* Spring Boot
* Spring Security
* JWT Authentication
* Spring Data JPA
* Hibernate

Database

* PostgreSQL

Development Tools

* Git
* GitHub
* Postman
* Docker (future deployment)
* Maven

⸻

Core Features

User Management

Authentication

* User registration
* User login
* User logout
* JWT-based authentication
* Protected routes

User Profile

* Username
* Email
* Avatar (future enhancement)
* Account settings

⸻

Anime Module

Anime Catalogue

Users can:

* Browse available anime
* Search anime by title
* Filter by genre
* View anime information

Anime Details

Each anime contains:

* Title
* Synopsis
* Cover image
* Release year
* Genres
* Episode list

⸻

Anime Streaming

Users can:

* Watch episodes
* Resume from previous progress
* View episode information
* Continue watching from last position

Watch Progress Tracking

The system records:

* Current episode
* Playback progress
* Last watched date

⸻

Manga Module

Manga Catalogue

Users can:

* Browse manga
* Search manga by title
* Filter by genre
* View manga information

Manga Details

Each manga contains:

* Title
* Description
* Cover image
* Author
* Chapter list

⸻

Manga Reader

Users can:

* Read chapters online
* Navigate between pages
* Resume reading progress
* Continue from last page viewed

Reading Progress Tracking

The system records:

* Current chapter
* Current page
* Last read date

⸻

Library System

Users can manage:

Favourite Anime

* Add anime to favourites
* Remove anime from favourites

Favourite Manga

* Add manga to favourites
* Remove manga from favourites

Continue Watching

* Resume unfinished episodes

Continue Reading

* Resume unfinished chapters

⸻

Recommendation System (Future Feature)

Based on user activity:

* Recommend anime from viewing history
* Recommend manga from reading history
* Recommend manga related to watched anime
* Recommend anime related to read manga

⸻

Database Entities

User

* id
* username
* email
* password
* createdAt

Anime

* id
* title
* description
* coverImage
* releaseYear

Episode

* id
* animeId
* episodeNumber
* title
* videoUrl
* duration

Manga

* id
* title
* description
* coverImage
* author

Chapter

* id
* mangaId
* chapterNumber
* title

Page

* id
* chapterId
* imageUrl
* pageNumber

Favourite

* id
* userId
* contentId
* contentType

WatchHistory

* id
* userId
* episodeId
* progress
* lastWatched

ReadingHistory

* id
* userId
* chapterId
* pageNumber
* lastRead

⸻

API Endpoints (Initial)

Authentication

POST /api/auth/register

POST /api/auth/login

⸻

Anime

GET /api/anime

GET /api/anime/{id}

GET /api/anime/{id}/episodes

⸻

Manga

GET /api/manga

GET /api/manga/{id}

GET /api/manga/{id}/chapters

⸻

User Library

GET /api/favourites

POST /api/favourites

DELETE /api/favourites/{id}

⸻

Non-Functional Requirements

Security

* JWT authentication
* Password encryption
* Role-based authorization (future)

Performance

* Fast search functionality
* Optimized database queries
* Efficient media delivery

Scalability

* Modular backend architecture
* RESTful API design
* Separation of concerns

Maintainability

* Clean code principles
* Layered architecture
* Comprehensive documentation

⸻

Development Phases

Phase 1 – Foundation

* Authentication
* User management
* Database setup
* API architecture

Phase 2 – Anime Platform

* Anime catalogue
* Anime details pages
* Episode management
* Video streaming

Phase 3 – Manga Platform

* Manga catalogue
* Chapter reader
* Reading progress tracking

Phase 4 – User Library

* Favourites
* Continue watching
* Continue reading

Phase 5 – Advanced Features

* Recommendations
* User reviews
* Ratings
* Notifications

Phase 6 – Deployment

* Dockerization
* Cloud deployment
* CI/CD pipeline
* Production configuration

⸻

Expected Learning Outcomes

By completing OtakuStream, the developer will gain experience in:

* Full-stack application development
* Spring Boot backend development
* Next.js frontend development
* Database design and modelling
* Authentication and security
* REST API development
* Media platform architecture
* Software engineering best practices
* Deployment and DevOps fundamentals
